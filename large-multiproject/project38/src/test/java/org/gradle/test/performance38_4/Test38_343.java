package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_343 {
    private final Production38_343 production = new Production38_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}