package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_479 {
    private final Production81_479 production = new Production81_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}