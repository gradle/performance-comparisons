package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_488 {
    private final Production71_488 production = new Production71_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}