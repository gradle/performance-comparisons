package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_435 {
    private final Production81_435 production = new Production81_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}