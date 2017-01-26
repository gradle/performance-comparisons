package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_139 {
    private final Production81_139 production = new Production81_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}