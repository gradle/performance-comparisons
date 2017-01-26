package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_500 {
    private final Production74_500 production = new Production74_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}