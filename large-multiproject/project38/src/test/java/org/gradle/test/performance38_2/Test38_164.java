package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_164 {
    private final Production38_164 production = new Production38_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}