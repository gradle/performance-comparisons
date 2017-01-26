package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_305 {
    private final Production3_305 production = new Production3_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}