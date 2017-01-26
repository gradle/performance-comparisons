package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_287 {
    private final Production81_287 production = new Production81_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}