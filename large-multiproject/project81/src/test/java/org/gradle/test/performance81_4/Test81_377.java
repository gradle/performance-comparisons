package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_377 {
    private final Production81_377 production = new Production81_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}