package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_436 {
    private final Production27_436 production = new Production27_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}