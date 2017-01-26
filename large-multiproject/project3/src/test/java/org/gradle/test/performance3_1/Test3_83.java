package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_83 {
    private final Production3_83 production = new Production3_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}