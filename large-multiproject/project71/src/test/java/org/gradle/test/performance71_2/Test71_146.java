package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_146 {
    private final Production71_146 production = new Production71_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}