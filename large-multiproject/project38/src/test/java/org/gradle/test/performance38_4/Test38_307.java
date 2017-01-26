package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_307 {
    private final Production38_307 production = new Production38_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}