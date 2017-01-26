package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_326 {
    private final Production90_326 production = new Production90_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}