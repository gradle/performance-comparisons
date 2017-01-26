package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_89 {
    private final Production38_89 production = new Production38_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}