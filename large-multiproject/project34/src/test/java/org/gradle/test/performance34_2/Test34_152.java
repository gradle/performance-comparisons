package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_152 {
    private final Production34_152 production = new Production34_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}