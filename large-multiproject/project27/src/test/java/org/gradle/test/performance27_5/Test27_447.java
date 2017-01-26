package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_447 {
    private final Production27_447 production = new Production27_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}