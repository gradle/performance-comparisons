package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_395 {
    private final Production81_395 production = new Production81_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}