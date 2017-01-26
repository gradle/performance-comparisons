package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_349 {
    private final Production27_349 production = new Production27_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}