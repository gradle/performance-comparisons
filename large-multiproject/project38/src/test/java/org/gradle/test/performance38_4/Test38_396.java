package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_396 {
    private final Production38_396 production = new Production38_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}