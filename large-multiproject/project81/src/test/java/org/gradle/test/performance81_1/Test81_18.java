package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_18 {
    private final Production81_18 production = new Production81_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}