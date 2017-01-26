package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_260 {
    private final Production71_260 production = new Production71_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}