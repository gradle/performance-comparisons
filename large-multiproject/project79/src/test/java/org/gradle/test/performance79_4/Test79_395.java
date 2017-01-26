package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_395 {
    private final Production79_395 production = new Production79_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}