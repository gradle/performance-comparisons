package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_47 {
    private final Production71_47 production = new Production71_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}