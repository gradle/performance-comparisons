package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_435 {
    private final Production79_435 production = new Production79_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}