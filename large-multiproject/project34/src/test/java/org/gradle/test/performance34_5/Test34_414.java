package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_414 {
    private final Production34_414 production = new Production34_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}