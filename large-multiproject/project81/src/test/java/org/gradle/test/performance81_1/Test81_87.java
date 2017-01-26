package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_87 {
    private final Production81_87 production = new Production81_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}