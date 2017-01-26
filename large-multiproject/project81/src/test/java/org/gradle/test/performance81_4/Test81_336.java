package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_336 {
    private final Production81_336 production = new Production81_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}