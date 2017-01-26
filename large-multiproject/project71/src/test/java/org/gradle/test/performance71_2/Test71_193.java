package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_193 {
    private final Production71_193 production = new Production71_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}