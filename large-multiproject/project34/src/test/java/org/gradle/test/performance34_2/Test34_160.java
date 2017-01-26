package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_160 {
    private final Production34_160 production = new Production34_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}