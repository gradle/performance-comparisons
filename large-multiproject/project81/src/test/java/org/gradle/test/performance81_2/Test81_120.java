package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_120 {
    private final Production81_120 production = new Production81_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}