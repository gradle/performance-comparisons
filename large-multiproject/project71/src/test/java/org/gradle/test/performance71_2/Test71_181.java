package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_181 {
    private final Production71_181 production = new Production71_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}