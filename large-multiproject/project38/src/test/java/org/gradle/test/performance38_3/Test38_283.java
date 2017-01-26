package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_283 {
    private final Production38_283 production = new Production38_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}