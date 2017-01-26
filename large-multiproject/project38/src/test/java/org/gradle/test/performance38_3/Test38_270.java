package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_270 {
    private final Production38_270 production = new Production38_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}