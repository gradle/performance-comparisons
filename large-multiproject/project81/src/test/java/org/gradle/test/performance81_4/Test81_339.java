package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_339 {
    private final Production81_339 production = new Production81_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}