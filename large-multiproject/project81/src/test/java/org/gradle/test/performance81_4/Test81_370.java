package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_370 {
    private final Production81_370 production = new Production81_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}