package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_146 {
    private final Production81_146 production = new Production81_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}