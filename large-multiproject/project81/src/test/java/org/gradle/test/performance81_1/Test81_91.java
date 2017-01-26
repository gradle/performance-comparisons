package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_91 {
    private final Production81_91 production = new Production81_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}