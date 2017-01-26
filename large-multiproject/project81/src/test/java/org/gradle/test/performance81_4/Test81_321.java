package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_321 {
    private final Production81_321 production = new Production81_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}