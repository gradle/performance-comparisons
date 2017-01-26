package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_302 {
    private final Production81_302 production = new Production81_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}