package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_326 {
    private final Production15_326 production = new Production15_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}