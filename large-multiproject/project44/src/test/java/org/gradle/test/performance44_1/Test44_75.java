package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_75 {
    private final Production44_75 production = new Production44_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}