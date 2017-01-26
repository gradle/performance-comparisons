package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_401 {
    private final Production71_401 production = new Production71_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}