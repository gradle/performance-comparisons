package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_224 {
    private final Production34_224 production = new Production34_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}