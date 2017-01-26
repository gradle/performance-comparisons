package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_497 {
    private final Production71_497 production = new Production71_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}