package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_150 {
    private final Production38_150 production = new Production38_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}