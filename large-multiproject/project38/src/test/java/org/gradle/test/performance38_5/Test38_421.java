package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_421 {
    private final Production38_421 production = new Production38_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}