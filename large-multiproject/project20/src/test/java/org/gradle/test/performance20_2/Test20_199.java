package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_199 {
    private final Production20_199 production = new Production20_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}