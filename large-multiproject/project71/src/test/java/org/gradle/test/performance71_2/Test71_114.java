package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_114 {
    private final Production71_114 production = new Production71_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}