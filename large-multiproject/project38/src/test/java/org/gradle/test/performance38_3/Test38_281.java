package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_281 {
    private final Production38_281 production = new Production38_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}