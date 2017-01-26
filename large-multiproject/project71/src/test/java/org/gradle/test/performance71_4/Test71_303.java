package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_303 {
    private final Production71_303 production = new Production71_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}