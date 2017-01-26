package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_459 {
    private final Production34_459 production = new Production34_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}