package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_329 {
    private final Production38_329 production = new Production38_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}