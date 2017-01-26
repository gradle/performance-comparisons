package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_317 {
    private final Production38_317 production = new Production38_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}