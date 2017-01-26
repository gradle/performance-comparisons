package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_197 {
    private final Production27_197 production = new Production27_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}