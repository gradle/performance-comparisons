package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_405 {
    private final Production38_405 production = new Production38_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}