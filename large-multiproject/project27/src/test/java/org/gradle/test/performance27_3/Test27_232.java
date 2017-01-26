package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_232 {
    private final Production27_232 production = new Production27_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}