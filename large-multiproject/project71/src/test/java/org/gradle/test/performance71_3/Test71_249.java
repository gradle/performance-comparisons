package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_249 {
    private final Production71_249 production = new Production71_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}