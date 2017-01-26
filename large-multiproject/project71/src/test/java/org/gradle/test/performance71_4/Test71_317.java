package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_317 {
    private final Production71_317 production = new Production71_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}