package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_217 {
    private final Production81_217 production = new Production81_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}