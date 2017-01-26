package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_469 {
    private final Production38_469 production = new Production38_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}