package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_135 {
    private final Production71_135 production = new Production71_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}