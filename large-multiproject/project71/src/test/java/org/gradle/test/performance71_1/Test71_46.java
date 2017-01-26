package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_46 {
    private final Production71_46 production = new Production71_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}