package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_192 {
    private final Production34_192 production = new Production34_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}