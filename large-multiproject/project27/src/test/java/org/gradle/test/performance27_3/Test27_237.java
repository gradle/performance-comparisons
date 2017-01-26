package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_237 {
    private final Production27_237 production = new Production27_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}