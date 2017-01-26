package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_181 {
    private final Production50_181 production = new Production50_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}