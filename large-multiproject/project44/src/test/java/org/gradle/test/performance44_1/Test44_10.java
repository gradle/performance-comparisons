package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_10 {
    private final Production44_10 production = new Production44_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}