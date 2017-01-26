package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_299 {
    private final Production34_299 production = new Production34_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}