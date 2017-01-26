package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_415 {
    private final Production71_415 production = new Production71_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}