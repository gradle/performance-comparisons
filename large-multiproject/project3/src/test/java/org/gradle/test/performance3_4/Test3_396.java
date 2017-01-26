package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_396 {
    private final Production3_396 production = new Production3_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}