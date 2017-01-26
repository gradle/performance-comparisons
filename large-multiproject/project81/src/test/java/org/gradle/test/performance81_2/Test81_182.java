package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_182 {
    private final Production81_182 production = new Production81_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}