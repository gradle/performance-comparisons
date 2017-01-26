package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_164 {
    private final Production71_164 production = new Production71_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}