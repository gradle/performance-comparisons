package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_131 {
    private final Production71_131 production = new Production71_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}