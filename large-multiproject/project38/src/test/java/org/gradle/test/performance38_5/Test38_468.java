package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_468 {
    private final Production38_468 production = new Production38_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}