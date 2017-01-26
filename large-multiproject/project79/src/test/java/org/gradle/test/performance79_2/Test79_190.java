package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_190 {
    private final Production79_190 production = new Production79_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}