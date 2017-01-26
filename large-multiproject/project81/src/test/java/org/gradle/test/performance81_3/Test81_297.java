package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_297 {
    private final Production81_297 production = new Production81_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}