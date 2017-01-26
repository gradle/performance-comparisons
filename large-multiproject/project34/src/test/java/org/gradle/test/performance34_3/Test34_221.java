package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_221 {
    private final Production34_221 production = new Production34_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}