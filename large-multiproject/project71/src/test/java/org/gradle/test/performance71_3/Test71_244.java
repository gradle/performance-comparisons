package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_244 {
    private final Production71_244 production = new Production71_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}