package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_318 {
    private final Production34_318 production = new Production34_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}