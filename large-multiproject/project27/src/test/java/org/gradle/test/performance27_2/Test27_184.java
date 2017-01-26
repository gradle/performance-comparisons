package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_184 {
    private final Production27_184 production = new Production27_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}