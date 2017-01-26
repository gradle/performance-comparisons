package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_477 {
    private final Production38_477 production = new Production38_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}