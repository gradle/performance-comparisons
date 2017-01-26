package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_239 {
    private final Production71_239 production = new Production71_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}