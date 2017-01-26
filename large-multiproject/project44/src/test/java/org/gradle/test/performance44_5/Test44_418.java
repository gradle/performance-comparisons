package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_418 {
    private final Production44_418 production = new Production44_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}