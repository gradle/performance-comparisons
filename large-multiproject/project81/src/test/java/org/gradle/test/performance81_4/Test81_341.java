package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_341 {
    private final Production81_341 production = new Production81_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}