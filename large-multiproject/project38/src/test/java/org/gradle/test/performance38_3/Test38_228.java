package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_228 {
    private final Production38_228 production = new Production38_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}