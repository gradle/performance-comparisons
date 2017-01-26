package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_293 {
    private final Production81_293 production = new Production81_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}