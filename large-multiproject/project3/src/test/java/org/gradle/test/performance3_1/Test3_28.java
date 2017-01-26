package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_28 {
    private final Production3_28 production = new Production3_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}