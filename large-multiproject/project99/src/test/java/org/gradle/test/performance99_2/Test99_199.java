package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_199 {
    private final Production99_199 production = new Production99_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}