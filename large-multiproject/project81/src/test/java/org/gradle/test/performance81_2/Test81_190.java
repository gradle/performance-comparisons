package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_190 {
    private final Production81_190 production = new Production81_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}