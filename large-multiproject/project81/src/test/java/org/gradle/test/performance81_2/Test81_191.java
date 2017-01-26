package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_191 {
    private final Production81_191 production = new Production81_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}