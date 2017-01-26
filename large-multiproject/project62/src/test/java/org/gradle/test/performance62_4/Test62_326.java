package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_326 {
    private final Production62_326 production = new Production62_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}