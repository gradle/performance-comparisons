package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_484 {
    private final Production38_484 production = new Production38_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}