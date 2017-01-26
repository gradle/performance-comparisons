package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_326 {
    private final Production38_326 production = new Production38_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}