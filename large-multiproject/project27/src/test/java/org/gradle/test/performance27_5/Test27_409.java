package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_409 {
    private final Production27_409 production = new Production27_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}