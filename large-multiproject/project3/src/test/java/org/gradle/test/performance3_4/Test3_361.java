package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_361 {
    private final Production3_361 production = new Production3_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}