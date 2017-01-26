package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_326 {
    private final Production81_326 production = new Production81_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}