package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_350 {
    private final Production81_350 production = new Production81_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}