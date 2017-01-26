package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_244 {
    private final Production79_244 production = new Production79_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}