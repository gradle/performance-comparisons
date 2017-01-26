package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_134 {
    private final Production81_134 production = new Production81_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}