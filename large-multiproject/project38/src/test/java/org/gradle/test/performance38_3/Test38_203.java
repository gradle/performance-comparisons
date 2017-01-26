package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_203 {
    private final Production38_203 production = new Production38_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}