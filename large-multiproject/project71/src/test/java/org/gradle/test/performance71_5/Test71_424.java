package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_424 {
    private final Production71_424 production = new Production71_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}