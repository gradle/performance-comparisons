package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_26 {
    private final Production3_26 production = new Production3_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}