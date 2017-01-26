package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_67 {
    private final Production3_67 production = new Production3_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}