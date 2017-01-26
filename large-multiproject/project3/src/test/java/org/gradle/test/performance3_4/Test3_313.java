package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_313 {
    private final Production3_313 production = new Production3_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}