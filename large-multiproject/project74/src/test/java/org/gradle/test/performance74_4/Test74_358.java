package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_358 {
    private final Production74_358 production = new Production74_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}