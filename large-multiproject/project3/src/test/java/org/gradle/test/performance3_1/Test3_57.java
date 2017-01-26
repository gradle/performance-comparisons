package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_57 {
    private final Production3_57 production = new Production3_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}