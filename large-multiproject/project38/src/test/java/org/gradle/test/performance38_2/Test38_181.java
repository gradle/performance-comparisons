package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_181 {
    private final Production38_181 production = new Production38_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}