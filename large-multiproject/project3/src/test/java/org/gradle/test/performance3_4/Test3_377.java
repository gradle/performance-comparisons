package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_377 {
    private final Production3_377 production = new Production3_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}