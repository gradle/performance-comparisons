package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_424 {
    private final Production81_424 production = new Production81_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}