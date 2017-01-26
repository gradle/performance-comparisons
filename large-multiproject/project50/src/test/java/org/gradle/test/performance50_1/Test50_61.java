package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_61 {
    private final Production50_61 production = new Production50_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}