package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_112 {
    private final Production71_112 production = new Production71_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}