package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_435 {
    private final Production71_435 production = new Production71_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}