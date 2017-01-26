package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_392 {
    private final Production3_392 production = new Production3_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}