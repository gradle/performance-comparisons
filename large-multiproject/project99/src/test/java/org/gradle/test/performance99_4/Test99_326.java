package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_326 {
    private final Production99_326 production = new Production99_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}