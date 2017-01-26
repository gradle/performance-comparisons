package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_236 {
    private final Production81_236 production = new Production81_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}