package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_400 {
    private final Production27_400 production = new Production27_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}