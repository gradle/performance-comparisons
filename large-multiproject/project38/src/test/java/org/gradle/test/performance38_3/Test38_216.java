package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_216 {
    private final Production38_216 production = new Production38_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}