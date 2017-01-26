package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_227 {
    private final Production38_227 production = new Production38_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}