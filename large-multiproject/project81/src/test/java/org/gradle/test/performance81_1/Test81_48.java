package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_48 {
    private final Production81_48 production = new Production81_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}