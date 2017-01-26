package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_485 {
    private final Production34_485 production = new Production34_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}