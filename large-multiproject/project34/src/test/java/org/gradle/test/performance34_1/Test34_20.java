package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_20 {
    private final Production34_20 production = new Production34_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}