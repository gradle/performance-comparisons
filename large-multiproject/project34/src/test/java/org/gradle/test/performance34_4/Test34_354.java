package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_354 {
    private final Production34_354 production = new Production34_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}