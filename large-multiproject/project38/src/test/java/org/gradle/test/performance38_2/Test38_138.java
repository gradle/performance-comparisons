package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_138 {
    private final Production38_138 production = new Production38_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}