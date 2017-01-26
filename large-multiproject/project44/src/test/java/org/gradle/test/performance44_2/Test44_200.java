package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_200 {
    private final Production44_200 production = new Production44_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}