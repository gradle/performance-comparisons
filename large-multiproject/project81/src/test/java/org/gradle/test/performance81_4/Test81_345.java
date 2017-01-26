package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_345 {
    private final Production81_345 production = new Production81_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}