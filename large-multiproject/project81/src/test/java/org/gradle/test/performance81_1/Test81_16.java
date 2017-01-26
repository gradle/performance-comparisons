package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_16 {
    private final Production81_16 production = new Production81_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}