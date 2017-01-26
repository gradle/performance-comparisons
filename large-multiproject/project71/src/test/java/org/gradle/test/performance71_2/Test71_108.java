package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_108 {
    private final Production71_108 production = new Production71_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}