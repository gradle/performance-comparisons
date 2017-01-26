package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_488 {
    private final Production81_488 production = new Production81_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}