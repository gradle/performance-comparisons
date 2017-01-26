package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_135 {
    private final Production38_135 production = new Production38_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}