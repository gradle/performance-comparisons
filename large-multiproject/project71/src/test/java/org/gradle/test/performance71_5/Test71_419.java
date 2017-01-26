package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_419 {
    private final Production71_419 production = new Production71_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}