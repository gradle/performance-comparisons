package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_38 {
    private final Production3_38 production = new Production3_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}