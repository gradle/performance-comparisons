package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_363 {
    private final Production71_363 production = new Production71_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}