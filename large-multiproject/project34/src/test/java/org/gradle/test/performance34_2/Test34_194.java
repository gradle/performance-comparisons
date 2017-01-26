package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_194 {
    private final Production34_194 production = new Production34_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}