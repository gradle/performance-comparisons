package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_441 {
    private final Production81_441 production = new Production81_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}