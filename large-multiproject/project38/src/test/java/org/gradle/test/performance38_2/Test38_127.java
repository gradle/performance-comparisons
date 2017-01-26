package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_127 {
    private final Production38_127 production = new Production38_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}