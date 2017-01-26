package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_326 {
    private final Production69_326 production = new Production69_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}