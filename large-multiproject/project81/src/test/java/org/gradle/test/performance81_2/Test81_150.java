package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_150 {
    private final Production81_150 production = new Production81_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}