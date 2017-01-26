package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_242 {
    private final Production81_242 production = new Production81_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}