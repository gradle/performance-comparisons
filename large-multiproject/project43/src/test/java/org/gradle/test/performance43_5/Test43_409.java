package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_409 {
    private final Production43_409 production = new Production43_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}