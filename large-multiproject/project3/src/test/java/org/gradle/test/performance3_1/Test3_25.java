package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_25 {
    private final Production3_25 production = new Production3_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}