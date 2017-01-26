package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_333 {
    private final Production34_333 production = new Production34_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}