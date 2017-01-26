package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_51 {
    private final Production71_51 production = new Production71_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}