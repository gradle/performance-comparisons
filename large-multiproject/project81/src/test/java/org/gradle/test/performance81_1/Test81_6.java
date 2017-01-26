package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_6 {
    private final Production81_6 production = new Production81_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}