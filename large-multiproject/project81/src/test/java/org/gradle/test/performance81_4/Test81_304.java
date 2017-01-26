package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_304 {
    private final Production81_304 production = new Production81_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}