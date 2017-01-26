package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_137 {
    private final Production81_137 production = new Production81_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}