package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_137 {
    private final Production38_137 production = new Production38_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}