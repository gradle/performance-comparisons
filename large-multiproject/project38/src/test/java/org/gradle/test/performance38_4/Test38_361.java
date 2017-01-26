package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_361 {
    private final Production38_361 production = new Production38_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}