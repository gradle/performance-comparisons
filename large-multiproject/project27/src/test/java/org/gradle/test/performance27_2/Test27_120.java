package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_120 {
    private final Production27_120 production = new Production27_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}