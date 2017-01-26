package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_326 {
    private final Production96_326 production = new Production96_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}