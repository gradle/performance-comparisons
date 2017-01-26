package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_24 {
    private final Production27_24 production = new Production27_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}