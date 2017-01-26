package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_217 {
    private final Production34_217 production = new Production34_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}