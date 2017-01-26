package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_477 {
    private final Production71_477 production = new Production71_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}