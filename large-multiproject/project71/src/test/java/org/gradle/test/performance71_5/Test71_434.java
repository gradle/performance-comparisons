package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_434 {
    private final Production71_434 production = new Production71_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}