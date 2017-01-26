package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_377 {
    private final Production71_377 production = new Production71_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}