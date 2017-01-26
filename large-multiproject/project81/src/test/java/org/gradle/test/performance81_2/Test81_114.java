package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_114 {
    private final Production81_114 production = new Production81_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}