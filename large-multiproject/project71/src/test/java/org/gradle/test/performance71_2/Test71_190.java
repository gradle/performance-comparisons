package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_190 {
    private final Production71_190 production = new Production71_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}