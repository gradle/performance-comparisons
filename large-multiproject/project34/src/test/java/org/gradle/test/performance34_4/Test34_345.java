package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_345 {
    private final Production34_345 production = new Production34_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}