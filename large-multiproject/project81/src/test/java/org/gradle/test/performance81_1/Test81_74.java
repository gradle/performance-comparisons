package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_74 {
    private final Production81_74 production = new Production81_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}