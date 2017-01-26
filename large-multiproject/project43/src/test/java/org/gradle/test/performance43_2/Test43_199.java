package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_199 {
    private final Production43_199 production = new Production43_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}