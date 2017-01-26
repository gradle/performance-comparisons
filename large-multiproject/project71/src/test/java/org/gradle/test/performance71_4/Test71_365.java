package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_365 {
    private final Production71_365 production = new Production71_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}