package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_57 {
    private final Production38_57 production = new Production38_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}