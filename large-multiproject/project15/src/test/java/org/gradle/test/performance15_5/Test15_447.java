package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_447 {
    private final Production15_447 production = new Production15_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}