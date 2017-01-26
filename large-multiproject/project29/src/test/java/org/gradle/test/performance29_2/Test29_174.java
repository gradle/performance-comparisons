package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_174 {
    private final Production29_174 production = new Production29_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}