package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_289 {
    private final Production71_289 production = new Production71_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}