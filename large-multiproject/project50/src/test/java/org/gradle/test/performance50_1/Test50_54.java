package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_54 {
    private final Production50_54 production = new Production50_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}