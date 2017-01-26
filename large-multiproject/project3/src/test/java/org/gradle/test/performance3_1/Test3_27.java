package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_27 {
    private final Production3_27 production = new Production3_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}