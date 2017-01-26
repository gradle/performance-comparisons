package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_212 {
    private final Production44_212 production = new Production44_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}