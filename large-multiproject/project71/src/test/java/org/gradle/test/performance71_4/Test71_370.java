package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_370 {
    private final Production71_370 production = new Production71_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}