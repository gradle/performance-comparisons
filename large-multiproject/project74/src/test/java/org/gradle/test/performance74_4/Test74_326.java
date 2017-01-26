package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_326 {
    private final Production74_326 production = new Production74_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}