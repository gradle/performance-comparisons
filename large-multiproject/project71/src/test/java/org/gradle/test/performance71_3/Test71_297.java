package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_297 {
    private final Production71_297 production = new Production71_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}