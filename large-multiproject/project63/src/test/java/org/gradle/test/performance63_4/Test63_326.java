package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_326 {
    private final Production63_326 production = new Production63_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}