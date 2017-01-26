package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_418 {
    private final Production74_418 production = new Production74_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}