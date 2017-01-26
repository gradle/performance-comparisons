package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_466 {
    private final Production71_466 production = new Production71_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}