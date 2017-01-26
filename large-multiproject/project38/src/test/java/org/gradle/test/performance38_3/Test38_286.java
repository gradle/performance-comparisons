package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_286 {
    private final Production38_286 production = new Production38_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}