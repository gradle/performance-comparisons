package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_175 {
    private final Production81_175 production = new Production81_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}