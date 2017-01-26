package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_138 {
    private final Production79_138 production = new Production79_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}