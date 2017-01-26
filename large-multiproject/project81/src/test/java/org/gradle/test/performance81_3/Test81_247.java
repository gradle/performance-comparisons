package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_247 {
    private final Production81_247 production = new Production81_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}