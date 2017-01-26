package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_229 {
    private final Production81_229 production = new Production81_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}