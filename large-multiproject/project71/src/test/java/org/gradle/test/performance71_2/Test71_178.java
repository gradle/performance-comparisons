package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_178 {
    private final Production71_178 production = new Production71_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}