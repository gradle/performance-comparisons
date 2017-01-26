package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_154 {
    private final Production44_154 production = new Production44_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}