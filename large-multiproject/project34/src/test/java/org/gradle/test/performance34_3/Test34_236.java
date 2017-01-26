package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_236 {
    private final Production34_236 production = new Production34_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}