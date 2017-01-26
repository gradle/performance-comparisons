package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_326 {
    private final Production60_326 production = new Production60_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}