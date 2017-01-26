package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_499 {
    private final Production38_499 production = new Production38_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}