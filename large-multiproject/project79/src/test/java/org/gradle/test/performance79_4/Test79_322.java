package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_322 {
    private final Production79_322 production = new Production79_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}