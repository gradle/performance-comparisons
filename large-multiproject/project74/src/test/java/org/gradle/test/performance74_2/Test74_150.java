package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_150 {
    private final Production74_150 production = new Production74_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}