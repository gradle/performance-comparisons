package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_161 {
    private final Production81_161 production = new Production81_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}