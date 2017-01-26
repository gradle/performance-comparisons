package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_447 {
    private final Production30_447 production = new Production30_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}