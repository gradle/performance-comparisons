package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_398 {
    private final Production79_398 production = new Production79_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}