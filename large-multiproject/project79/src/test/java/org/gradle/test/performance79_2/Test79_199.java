package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_199 {
    private final Production79_199 production = new Production79_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}