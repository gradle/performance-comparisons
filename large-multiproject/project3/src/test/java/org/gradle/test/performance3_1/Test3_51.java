package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_51 {
    private final Production3_51 production = new Production3_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}