package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_333 {
    private final Production15_333 production = new Production15_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}