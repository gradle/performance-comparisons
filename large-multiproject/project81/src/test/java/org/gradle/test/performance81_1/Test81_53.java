package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_53 {
    private final Production81_53 production = new Production81_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}