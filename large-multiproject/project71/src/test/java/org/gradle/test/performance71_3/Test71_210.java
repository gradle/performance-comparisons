package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_210 {
    private final Production71_210 production = new Production71_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}