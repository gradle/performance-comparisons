package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_419 {
    private final Production79_419 production = new Production79_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}