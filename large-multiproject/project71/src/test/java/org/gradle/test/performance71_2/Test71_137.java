package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_137 {
    private final Production71_137 production = new Production71_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}