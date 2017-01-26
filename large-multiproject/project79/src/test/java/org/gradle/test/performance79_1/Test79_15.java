package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_15 {
    private final Production79_15 production = new Production79_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}