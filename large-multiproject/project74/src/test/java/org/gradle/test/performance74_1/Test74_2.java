package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_2 {
    private final Production74_2 production = new Production74_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}