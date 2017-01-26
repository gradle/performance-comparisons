package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_290 {
    private final Production79_290 production = new Production79_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}