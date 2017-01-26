package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_130 {
    private final Production34_130 production = new Production34_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}