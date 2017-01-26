package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_289 {
    private final Production81_289 production = new Production81_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}