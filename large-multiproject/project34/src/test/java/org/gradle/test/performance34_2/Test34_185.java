package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_185 {
    private final Production34_185 production = new Production34_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}