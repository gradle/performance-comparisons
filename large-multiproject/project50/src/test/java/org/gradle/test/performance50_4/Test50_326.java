package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_326 {
    private final Production50_326 production = new Production50_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}