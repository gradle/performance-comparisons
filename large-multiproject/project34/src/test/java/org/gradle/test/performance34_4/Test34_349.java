package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_349 {
    private final Production34_349 production = new Production34_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}