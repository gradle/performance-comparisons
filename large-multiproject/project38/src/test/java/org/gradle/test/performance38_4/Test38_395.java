package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_395 {
    private final Production38_395 production = new Production38_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}