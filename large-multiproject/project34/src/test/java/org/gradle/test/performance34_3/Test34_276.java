package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_276 {
    private final Production34_276 production = new Production34_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}