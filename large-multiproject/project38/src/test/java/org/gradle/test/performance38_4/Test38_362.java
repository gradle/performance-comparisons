package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_362 {
    private final Production38_362 production = new Production38_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}