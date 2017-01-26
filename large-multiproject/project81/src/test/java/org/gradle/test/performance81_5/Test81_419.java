package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_419 {
    private final Production81_419 production = new Production81_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}