package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_199 {
    private final Production44_199 production = new Production44_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}