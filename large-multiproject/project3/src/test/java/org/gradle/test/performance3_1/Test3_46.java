package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_46 {
    private final Production3_46 production = new Production3_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}