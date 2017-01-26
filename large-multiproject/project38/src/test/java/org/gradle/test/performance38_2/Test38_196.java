package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_196 {
    private final Production38_196 production = new Production38_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}