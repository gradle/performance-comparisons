package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_455 {
    private final Production38_455 production = new Production38_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}