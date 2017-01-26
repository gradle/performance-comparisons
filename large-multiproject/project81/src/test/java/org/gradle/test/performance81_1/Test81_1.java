package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_1 {
    private final Production81_1 production = new Production81_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}