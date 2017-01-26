package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_313 {
    private final Production71_313 production = new Production71_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}