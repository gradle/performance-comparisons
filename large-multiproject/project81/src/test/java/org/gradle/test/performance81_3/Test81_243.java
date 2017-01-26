package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_243 {
    private final Production81_243 production = new Production81_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}