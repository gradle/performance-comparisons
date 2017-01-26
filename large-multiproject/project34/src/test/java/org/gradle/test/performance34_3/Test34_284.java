package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_284 {
    private final Production34_284 production = new Production34_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}