package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_134 {
    private final Production3_134 production = new Production3_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}