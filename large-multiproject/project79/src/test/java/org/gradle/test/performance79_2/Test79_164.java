package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_164 {
    private final Production79_164 production = new Production79_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}