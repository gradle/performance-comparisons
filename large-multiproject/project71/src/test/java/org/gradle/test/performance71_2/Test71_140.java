package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_140 {
    private final Production71_140 production = new Production71_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}