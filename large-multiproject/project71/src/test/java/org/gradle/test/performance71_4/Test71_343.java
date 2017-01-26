package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_343 {
    private final Production71_343 production = new Production71_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}