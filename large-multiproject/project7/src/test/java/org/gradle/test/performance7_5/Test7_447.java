package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_447 {
    private final Production7_447 production = new Production7_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}