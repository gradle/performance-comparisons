package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_1 {
    private final Production71_1 production = new Production71_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}