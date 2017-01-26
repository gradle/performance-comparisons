package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_459 {
    private final Production27_459 production = new Production27_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}