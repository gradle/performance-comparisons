package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_497 {
    private final Production3_497 production = new Production3_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}