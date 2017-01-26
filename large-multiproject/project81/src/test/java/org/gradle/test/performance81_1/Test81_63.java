package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_63 {
    private final Production81_63 production = new Production81_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}