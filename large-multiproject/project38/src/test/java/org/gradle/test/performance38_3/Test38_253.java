package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_253 {
    private final Production38_253 production = new Production38_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}