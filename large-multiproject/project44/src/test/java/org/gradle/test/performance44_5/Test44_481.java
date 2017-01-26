package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_481 {
    private final Production44_481 production = new Production44_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}