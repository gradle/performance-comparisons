package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_326 {
    private final Production77_326 production = new Production77_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}