package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_156 {
    private final Production50_156 production = new Production50_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}