package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_258 {
    private final Production34_258 production = new Production34_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}