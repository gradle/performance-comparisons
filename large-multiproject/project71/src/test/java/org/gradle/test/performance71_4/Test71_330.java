package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_330 {
    private final Production71_330 production = new Production71_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}