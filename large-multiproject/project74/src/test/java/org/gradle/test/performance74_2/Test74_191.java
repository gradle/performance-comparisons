package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_191 {
    private final Production74_191 production = new Production74_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}