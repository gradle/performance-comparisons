package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_403 {
    private final Production81_403 production = new Production81_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}