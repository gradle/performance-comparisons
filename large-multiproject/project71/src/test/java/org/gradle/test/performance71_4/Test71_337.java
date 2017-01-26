package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_337 {
    private final Production71_337 production = new Production71_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}