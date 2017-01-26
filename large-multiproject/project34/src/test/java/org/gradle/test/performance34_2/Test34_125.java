package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_125 {
    private final Production34_125 production = new Production34_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}