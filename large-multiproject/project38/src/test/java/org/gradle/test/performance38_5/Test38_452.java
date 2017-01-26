package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_452 {
    private final Production38_452 production = new Production38_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}