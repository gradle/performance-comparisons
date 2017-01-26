package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_150 {
    private final Production71_150 production = new Production71_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}