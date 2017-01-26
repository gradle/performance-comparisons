package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_405 {
    private final Production71_405 production = new Production71_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}