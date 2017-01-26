package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_431 {
    private final Production71_431 production = new Production71_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}