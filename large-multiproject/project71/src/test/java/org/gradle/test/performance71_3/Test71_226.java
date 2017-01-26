package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_226 {
    private final Production71_226 production = new Production71_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}