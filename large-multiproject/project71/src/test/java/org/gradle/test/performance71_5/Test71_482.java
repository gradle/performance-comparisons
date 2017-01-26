package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_482 {
    private final Production71_482 production = new Production71_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}