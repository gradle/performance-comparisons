package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_333 {
    private final Production81_333 production = new Production81_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}