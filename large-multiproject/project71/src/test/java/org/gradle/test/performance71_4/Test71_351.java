package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_351 {
    private final Production71_351 production = new Production71_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}