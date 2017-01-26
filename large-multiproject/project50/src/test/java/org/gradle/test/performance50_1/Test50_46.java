package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_46 {
    private final Production50_46 production = new Production50_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}