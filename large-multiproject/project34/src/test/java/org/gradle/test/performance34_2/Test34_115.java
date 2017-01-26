package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_115 {
    private final Production34_115 production = new Production34_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}