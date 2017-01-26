package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_41 {
    private final Production3_41 production = new Production3_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}