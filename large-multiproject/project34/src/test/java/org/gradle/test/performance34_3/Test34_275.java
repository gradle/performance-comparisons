package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_275 {
    private final Production34_275 production = new Production34_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}