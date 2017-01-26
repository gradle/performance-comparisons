package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_307 {
    private final Production71_307 production = new Production71_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}