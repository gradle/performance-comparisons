package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_482 {
    private final Production81_482 production = new Production81_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}