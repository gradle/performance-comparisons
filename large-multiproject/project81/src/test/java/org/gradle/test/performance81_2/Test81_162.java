package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_162 {
    private final Production81_162 production = new Production81_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}