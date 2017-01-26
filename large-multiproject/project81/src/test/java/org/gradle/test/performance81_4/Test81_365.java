package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_365 {
    private final Production81_365 production = new Production81_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}