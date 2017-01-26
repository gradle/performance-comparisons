package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_2 {
    private final Production71_2 production = new Production71_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}