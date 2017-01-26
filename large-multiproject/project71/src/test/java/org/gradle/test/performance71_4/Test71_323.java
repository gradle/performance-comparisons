package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_323 {
    private final Production71_323 production = new Production71_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}