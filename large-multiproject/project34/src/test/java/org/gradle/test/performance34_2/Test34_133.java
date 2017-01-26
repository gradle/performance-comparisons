package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_133 {
    private final Production34_133 production = new Production34_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}