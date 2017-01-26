package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_336 {
    private final Production71_336 production = new Production71_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}