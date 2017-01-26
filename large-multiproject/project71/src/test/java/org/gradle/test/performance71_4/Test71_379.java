package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_379 {
    private final Production71_379 production = new Production71_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}