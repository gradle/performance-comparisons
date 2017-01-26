package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_205 {
    private final Production34_205 production = new Production34_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}