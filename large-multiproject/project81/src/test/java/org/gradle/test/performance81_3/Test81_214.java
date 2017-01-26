package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_214 {
    private final Production81_214 production = new Production81_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}