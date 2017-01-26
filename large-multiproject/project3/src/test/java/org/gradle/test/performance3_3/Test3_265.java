package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_265 {
    private final Production3_265 production = new Production3_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}