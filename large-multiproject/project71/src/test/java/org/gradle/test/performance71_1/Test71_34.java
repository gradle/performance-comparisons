package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_34 {
    private final Production71_34 production = new Production71_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}