package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_63 {
    private final Production3_63 production = new Production3_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}