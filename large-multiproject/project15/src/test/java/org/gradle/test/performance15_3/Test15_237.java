package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_237 {
    private final Production15_237 production = new Production15_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}