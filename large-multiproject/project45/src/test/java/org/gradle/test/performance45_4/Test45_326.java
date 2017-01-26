package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_326 {
    private final Production45_326 production = new Production45_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}