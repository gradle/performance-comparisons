package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_313 {
    private final Production81_313 production = new Production81_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}