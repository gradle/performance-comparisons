package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_84 {
    private final Production81_84 production = new Production81_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}