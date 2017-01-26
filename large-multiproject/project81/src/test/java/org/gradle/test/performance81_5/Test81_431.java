package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_431 {
    private final Production81_431 production = new Production81_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}