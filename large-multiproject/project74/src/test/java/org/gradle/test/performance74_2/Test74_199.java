package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_199 {
    private final Production74_199 production = new Production74_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}