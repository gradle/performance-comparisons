package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_247 {
    private final Production71_247 production = new Production71_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}