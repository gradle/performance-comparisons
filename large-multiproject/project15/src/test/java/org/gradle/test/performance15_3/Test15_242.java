package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_242 {
    private final Production15_242 production = new Production15_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}