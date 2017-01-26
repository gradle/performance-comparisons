package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_272 {
    private final Production81_272 production = new Production81_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}