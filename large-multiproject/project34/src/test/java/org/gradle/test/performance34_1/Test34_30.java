package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_30 {
    private final Production34_30 production = new Production34_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}