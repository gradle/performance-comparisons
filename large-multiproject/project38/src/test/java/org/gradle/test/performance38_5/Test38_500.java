package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_500 {
    private final Production38_500 production = new Production38_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}