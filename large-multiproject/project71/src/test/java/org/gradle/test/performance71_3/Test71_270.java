package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_270 {
    private final Production71_270 production = new Production71_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}