package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_390 {
    private final Production71_390 production = new Production71_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}