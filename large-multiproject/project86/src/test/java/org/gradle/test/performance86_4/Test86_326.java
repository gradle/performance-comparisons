package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_326 {
    private final Production86_326 production = new Production86_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}