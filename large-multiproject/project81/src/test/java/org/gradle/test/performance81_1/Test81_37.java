package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_37 {
    private final Production81_37 production = new Production81_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}