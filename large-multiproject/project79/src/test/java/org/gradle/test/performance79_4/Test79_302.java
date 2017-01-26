package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_302 {
    private final Production79_302 production = new Production79_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}