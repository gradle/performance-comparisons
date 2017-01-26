package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_324 {
    private final Production71_324 production = new Production71_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}