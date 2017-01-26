package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_307 {
    private final Production81_307 production = new Production81_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}