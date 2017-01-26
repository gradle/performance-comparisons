package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_386 {
    private final Production38_386 production = new Production38_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}