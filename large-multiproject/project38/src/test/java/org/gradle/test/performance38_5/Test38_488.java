package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_488 {
    private final Production38_488 production = new Production38_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}