package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_356 {
    private final Production71_356 production = new Production71_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}