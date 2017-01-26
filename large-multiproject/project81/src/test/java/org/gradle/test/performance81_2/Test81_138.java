package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_138 {
    private final Production81_138 production = new Production81_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}