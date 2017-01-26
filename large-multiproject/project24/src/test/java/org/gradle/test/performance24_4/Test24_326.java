package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_326 {
    private final Production24_326 production = new Production24_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}