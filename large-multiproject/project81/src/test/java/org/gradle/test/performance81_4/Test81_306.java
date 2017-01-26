package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_306 {
    private final Production81_306 production = new Production81_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}