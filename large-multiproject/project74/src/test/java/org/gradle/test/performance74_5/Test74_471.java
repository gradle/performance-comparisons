package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_471 {
    private final Production74_471 production = new Production74_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}