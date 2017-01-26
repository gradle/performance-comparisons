package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_477 {
    private final Production81_477 production = new Production81_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}