package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_136 {
    private final Production71_136 production = new Production71_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}