package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_367 {
    private final Production81_367 production = new Production81_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}