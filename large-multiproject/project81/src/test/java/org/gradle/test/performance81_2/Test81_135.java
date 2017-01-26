package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_135 {
    private final Production81_135 production = new Production81_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}