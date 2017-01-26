package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_360 {
    private final Production81_360 production = new Production81_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}