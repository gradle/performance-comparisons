package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_276 {
    private final Production27_276 production = new Production27_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}