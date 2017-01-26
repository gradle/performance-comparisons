package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_31 {
    private final Production81_31 production = new Production81_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}