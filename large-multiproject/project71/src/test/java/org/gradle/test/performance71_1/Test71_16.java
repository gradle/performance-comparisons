package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_16 {
    private final Production71_16 production = new Production71_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}