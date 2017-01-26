package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_305 {
    private final Production38_305 production = new Production38_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}