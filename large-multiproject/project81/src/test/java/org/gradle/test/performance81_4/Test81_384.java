package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_384 {
    private final Production81_384 production = new Production81_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}