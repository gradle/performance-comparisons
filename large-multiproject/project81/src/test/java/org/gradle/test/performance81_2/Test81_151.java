package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_151 {
    private final Production81_151 production = new Production81_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}