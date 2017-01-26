package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_372 {
    private final Production34_372 production = new Production34_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}