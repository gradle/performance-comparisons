package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_231 {
    private final Production71_231 production = new Production71_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}