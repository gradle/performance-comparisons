package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_112 {
    private final Production44_112 production = new Production44_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}