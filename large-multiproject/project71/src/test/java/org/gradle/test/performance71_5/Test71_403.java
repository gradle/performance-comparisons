package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_403 {
    private final Production71_403 production = new Production71_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}