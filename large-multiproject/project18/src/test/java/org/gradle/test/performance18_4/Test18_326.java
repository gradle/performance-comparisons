package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_326 {
    private final Production18_326 production = new Production18_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}