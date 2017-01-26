package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_59 {
    private final Production3_59 production = new Production3_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}