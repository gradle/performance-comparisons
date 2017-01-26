package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_447 {
    private final Production18_447 production = new Production18_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}