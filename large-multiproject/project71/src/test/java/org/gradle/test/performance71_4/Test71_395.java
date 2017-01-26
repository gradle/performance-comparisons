package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_395 {
    private final Production71_395 production = new Production71_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}