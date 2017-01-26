package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_171 {
    private final Production38_171 production = new Production38_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}