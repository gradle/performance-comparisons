package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_422 {
    private final Production81_422 production = new Production81_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}