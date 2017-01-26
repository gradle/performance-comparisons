package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_213 {
    private final Production34_213 production = new Production34_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}