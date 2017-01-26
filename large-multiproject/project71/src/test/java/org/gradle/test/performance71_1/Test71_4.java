package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_4 {
    private final Production71_4 production = new Production71_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}