package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_458 {
    private final Production3_458 production = new Production3_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}