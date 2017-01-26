package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_286 {
    private final Production71_286 production = new Production71_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}