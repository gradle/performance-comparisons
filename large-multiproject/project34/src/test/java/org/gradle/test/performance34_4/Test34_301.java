package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_301 {
    private final Production34_301 production = new Production34_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}