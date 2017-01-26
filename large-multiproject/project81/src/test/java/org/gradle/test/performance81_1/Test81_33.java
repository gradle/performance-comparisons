package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_33 {
    private final Production81_33 production = new Production81_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}