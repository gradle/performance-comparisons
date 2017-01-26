package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_396 {
    private final Production81_396 production = new Production81_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}