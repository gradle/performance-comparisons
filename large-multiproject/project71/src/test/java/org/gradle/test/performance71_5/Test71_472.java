package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_472 {
    private final Production71_472 production = new Production71_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}