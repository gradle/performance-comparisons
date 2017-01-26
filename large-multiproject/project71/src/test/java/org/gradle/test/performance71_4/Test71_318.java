package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_318 {
    private final Production71_318 production = new Production71_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}