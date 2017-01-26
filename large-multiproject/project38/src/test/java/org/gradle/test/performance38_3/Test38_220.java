package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_220 {
    private final Production38_220 production = new Production38_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}