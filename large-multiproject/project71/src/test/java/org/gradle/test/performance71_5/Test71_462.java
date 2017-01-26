package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_462 {
    private final Production71_462 production = new Production71_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}