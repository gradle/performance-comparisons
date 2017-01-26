package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_243 {
    private final Production71_243 production = new Production71_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}