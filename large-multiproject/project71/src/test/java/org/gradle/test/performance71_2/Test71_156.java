package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_156 {
    private final Production71_156 production = new Production71_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}