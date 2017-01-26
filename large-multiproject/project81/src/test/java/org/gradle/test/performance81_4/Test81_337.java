package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_337 {
    private final Production81_337 production = new Production81_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}