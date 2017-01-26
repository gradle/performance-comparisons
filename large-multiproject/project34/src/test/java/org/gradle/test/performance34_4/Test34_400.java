package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_400 {
    private final Production34_400 production = new Production34_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}