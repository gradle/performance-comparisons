package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_100 {
    private final Production44_100 production = new Production44_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}