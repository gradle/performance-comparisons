package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_108 {
    private final Production34_108 production = new Production34_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}