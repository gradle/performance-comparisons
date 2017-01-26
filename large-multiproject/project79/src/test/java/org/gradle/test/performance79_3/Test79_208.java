package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_208 {
    private final Production79_208 production = new Production79_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}