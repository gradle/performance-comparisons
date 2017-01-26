package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_35 {
    private final Production81_35 production = new Production81_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}