package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_423 {
    private final Production81_423 production = new Production81_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}