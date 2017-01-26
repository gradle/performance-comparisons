package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_161 {
    private final Production71_161 production = new Production71_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}