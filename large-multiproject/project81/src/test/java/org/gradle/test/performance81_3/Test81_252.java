package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_252 {
    private final Production81_252 production = new Production81_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}