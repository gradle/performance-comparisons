package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_79 {
    private final Production81_79 production = new Production81_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}