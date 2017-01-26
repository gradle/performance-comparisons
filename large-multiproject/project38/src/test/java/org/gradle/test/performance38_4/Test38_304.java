package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_304 {
    private final Production38_304 production = new Production38_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}