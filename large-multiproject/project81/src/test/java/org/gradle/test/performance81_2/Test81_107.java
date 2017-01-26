package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_107 {
    private final Production81_107 production = new Production81_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}