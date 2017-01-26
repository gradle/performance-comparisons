package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22480 {
    private final Productionnull_22480 production = new Productionnull_22480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}