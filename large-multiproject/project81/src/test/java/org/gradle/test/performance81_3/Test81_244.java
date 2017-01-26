package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_244 {
    private final Production81_244 production = new Production81_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}