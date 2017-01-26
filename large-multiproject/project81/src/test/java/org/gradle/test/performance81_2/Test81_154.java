package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_154 {
    private final Production81_154 production = new Production81_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}