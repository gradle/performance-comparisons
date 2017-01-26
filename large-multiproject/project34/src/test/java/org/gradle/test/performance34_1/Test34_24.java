package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_24 {
    private final Production34_24 production = new Production34_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}