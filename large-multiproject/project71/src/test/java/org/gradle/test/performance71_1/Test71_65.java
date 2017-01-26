package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_65 {
    private final Production71_65 production = new Production71_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}