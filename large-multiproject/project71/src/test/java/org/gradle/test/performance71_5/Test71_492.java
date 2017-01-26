package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_492 {
    private final Production71_492 production = new Production71_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}