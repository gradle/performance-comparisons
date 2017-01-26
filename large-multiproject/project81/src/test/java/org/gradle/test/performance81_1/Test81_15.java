package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_15 {
    private final Production81_15 production = new Production81_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}