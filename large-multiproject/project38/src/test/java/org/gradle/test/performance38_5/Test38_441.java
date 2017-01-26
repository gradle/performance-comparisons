package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_441 {
    private final Production38_441 production = new Production38_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}