package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_317 {
    private final Production81_317 production = new Production81_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}