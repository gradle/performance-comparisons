package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_272 {
    private final Production71_272 production = new Production71_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}