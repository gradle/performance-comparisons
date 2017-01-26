package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_90 {
    private final Production90_90 production = new Production90_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}