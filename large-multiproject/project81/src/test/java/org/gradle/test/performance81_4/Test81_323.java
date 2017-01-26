package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_323 {
    private final Production81_323 production = new Production81_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}