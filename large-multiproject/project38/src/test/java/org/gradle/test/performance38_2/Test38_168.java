package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_168 {
    private final Production38_168 production = new Production38_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}