package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_326 {
    private final Production49_326 production = new Production49_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}