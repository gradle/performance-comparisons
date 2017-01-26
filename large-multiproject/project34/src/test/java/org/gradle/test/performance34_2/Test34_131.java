package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_131 {
    private final Production34_131 production = new Production34_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}