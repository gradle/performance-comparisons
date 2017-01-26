package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_470 {
    private final Production38_470 production = new Production38_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}