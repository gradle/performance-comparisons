package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_33 {
    private final Production71_33 production = new Production71_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}