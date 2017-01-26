package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_224 {
    private final Production81_224 production = new Production81_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}