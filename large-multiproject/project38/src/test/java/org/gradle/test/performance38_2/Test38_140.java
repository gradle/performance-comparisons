package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_140 {
    private final Production38_140 production = new Production38_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}