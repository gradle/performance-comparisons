package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_187 {
    private final Production38_187 production = new Production38_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}