package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_213 {
    private final Production71_213 production = new Production71_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}