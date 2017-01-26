package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_216 {
    private final Production81_216 production = new Production81_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}