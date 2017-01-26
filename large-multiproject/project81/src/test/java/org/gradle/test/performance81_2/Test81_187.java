package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_187 {
    private final Production81_187 production = new Production81_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}