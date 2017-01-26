package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_326 {
    private final Production11_326 production = new Production11_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}