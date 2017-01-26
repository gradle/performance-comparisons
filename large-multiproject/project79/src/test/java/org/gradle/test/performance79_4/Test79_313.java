package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_313 {
    private final Production79_313 production = new Production79_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}