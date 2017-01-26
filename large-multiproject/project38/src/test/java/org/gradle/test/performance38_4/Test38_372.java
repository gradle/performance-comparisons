package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_372 {
    private final Production38_372 production = new Production38_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}