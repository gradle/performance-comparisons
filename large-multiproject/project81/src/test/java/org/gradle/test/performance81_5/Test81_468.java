package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_468 {
    private final Production81_468 production = new Production81_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}