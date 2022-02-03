package com.create.behavioural.commands;

public class CommandsTestDrive {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Light secondLight = new Light();
        Stereo stereo = new Stereo();

        LightsOnCommand lightsOnCommand = new LightsOnCommand(light);
        LightsOffCommand lightsOffCommand = new LightsOffCommand(light);
        LightsOnCommand secondLightsOnCommand = new LightsOnCommand(secondLight);
        LightsOffCommand secondLightsOffCommand = new LightsOffCommand(secondLight);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightsOnCommand, lightsOffCommand);
        remoteControl.setCommand(1, secondLightsOnCommand, secondLightsOffCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(2);
    }
}
