package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_42 {
    private final Production3_42 production = new Production3_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}