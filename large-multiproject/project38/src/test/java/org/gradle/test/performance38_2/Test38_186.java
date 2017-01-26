package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_186 {
    private final Production38_186 production = new Production38_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}