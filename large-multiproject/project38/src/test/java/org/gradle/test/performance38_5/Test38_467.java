package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_467 {
    private final Production38_467 production = new Production38_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}