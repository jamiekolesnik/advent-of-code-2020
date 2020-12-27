package days;

import resources.AdventDataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day08 {

    public static void main(String[] args) throws IOException {
        String inputData = "";
        inputData = AdventDataReader.readFromInputStream("Day08_02.txt");

        List<Instruction> instructions = formatInputData(inputData);

        int criticalStep = getLastAccBeforeLoop(instructions);
        System.out.println(criticalStep);
    }

    private static int getLastAccBeforeLoop(List<Instruction> instructions) {
        int accumulator = 0;
        for (int i = 0; i < instructions.size(); i++) {
            Instruction instr = instructions.get(i);
            if (instr.getOperation().equals("acc")) {
                if (instr.isExecuted()) {
                    break;
                } else {
                    instr.setExecuted(true);
                }
                accumulator += instr.getArgument();
            }
            if (instr.getOperation().equals("jmp")) {
                i += instructions.get(i).getArgument() - 1;
            }
        }

        return accumulator;
    }

    private static List<Instruction> formatInputData(String inputData) {
        String[] data = inputData.split(" |\n");

        List<Instruction> instructions = new ArrayList<>();
        for (int i = 0; i < data.length; i += 2) {
            instructions.add(new Instruction(i, data[i], Integer.parseInt(data[i + 1])));
        }
        return instructions;
    }
}

class Instruction {
    private int position;
    private String operation;
    private int argument;
    private boolean executed;

    public Instruction(int position, String operation, int argument) {
        this.position = position;
        this.operation = operation;
        this.argument = argument;
        this.executed = false;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getArgument() {
        return argument;
    }

    public void setArgument(int argument) {
        this.argument = argument;
    }

    public boolean isExecuted() {
        return executed;
    }

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
