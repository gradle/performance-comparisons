package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_446 {
    private final Production71_446 production = new Production71_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}