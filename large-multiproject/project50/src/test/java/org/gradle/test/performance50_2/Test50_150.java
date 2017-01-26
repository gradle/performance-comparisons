package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_150 {
    private final Production50_150 production = new Production50_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}