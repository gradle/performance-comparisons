package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_290 {
    private final Production81_290 production = new Production81_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}