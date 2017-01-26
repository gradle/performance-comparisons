package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_163 {
    private final Production71_163 production = new Production71_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}