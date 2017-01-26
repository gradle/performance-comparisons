package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_15 {
    private final Production71_15 production = new Production71_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}