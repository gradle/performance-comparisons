package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_466 {
    private final Production38_466 production = new Production38_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}