package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_195 {
    private final Production74_195 production = new Production74_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}