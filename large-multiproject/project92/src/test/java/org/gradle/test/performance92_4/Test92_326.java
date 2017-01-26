package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_326 {
    private final Production92_326 production = new Production92_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}