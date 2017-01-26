package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_222 {
    private final Production3_222 production = new Production3_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}