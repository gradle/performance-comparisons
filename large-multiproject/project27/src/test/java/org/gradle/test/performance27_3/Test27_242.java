package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_242 {
    private final Production27_242 production = new Production27_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}