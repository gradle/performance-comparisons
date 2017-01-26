package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_2 {
    private final Production3_2 production = new Production3_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}