package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_26 {
    private final Production71_26 production = new Production71_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}