package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_342 {
    private final Production81_342 production = new Production81_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}