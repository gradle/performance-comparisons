package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_357 {
    private final Production71_357 production = new Production71_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}