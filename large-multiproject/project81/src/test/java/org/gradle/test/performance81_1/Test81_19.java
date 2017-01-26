package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_19 {
    private final Production81_19 production = new Production81_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}