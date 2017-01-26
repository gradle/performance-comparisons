package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_363 {
    private final Production38_363 production = new Production38_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}