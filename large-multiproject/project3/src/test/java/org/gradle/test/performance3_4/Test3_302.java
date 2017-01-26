package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_302 {
    private final Production3_302 production = new Production3_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}