package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_257 {
    private final Production81_257 production = new Production81_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}