package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_471 {
    private final Production71_471 production = new Production71_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}