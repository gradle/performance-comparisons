package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_304 {
    private final Production71_304 production = new Production71_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}