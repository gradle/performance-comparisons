package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_241 {
    private final Production81_241 production = new Production81_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}