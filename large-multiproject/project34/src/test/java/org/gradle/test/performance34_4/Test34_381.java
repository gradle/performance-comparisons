package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_381 {
    private final Production34_381 production = new Production34_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}