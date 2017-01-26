package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_481 {
    private final Production71_481 production = new Production71_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}