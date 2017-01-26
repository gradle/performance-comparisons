package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_485 {
    private final Production18_485 production = new Production18_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}