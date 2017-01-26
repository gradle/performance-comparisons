package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_113 {
    private final Production34_113 production = new Production34_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}