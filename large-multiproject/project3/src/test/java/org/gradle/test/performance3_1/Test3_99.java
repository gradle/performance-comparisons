package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_99 {
    private final Production3_99 production = new Production3_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}