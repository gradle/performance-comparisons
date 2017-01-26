package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_3 {
    private final Production3_3 production = new Production3_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}