package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_146 {
    private final Production50_146 production = new Production50_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}