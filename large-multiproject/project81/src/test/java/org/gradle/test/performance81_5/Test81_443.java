package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_443 {
    private final Production81_443 production = new Production81_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}