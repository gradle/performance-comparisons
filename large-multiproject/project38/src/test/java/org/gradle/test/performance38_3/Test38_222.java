package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_222 {
    private final Production38_222 production = new Production38_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}