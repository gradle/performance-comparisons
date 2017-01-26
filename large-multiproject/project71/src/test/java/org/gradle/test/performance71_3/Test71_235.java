package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_235 {
    private final Production71_235 production = new Production71_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}