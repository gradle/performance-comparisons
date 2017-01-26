package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_204 {
    private final Production38_204 production = new Production38_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}