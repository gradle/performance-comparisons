package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_138 {
    private final Production71_138 production = new Production71_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}