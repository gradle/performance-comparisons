package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_419 {
    private final Production74_419 production = new Production74_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}