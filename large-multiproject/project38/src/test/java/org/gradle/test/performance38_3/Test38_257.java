package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_257 {
    private final Production38_257 production = new Production38_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}