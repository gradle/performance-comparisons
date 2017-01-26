package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_360 {
    private final Production71_360 production = new Production71_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}