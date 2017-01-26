package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_281 {
    private final Production71_281 production = new Production71_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}