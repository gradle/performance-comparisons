package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_270 {
    private final Production3_270 production = new Production3_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}