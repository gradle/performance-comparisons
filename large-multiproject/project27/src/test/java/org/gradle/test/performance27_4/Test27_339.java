package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_339 {
    private final Production27_339 production = new Production27_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}