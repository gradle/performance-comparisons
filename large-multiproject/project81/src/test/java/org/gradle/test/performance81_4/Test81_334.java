package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_334 {
    private final Production81_334 production = new Production81_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}