package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_254 {
    private final Production34_254 production = new Production34_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}