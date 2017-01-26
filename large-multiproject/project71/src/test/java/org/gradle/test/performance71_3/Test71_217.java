package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_217 {
    private final Production71_217 production = new Production71_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}