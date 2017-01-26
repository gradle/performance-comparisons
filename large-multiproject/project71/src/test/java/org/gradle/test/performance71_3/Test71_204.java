package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_204 {
    private final Production71_204 production = new Production71_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}