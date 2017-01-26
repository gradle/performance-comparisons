package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_27 {
    private final Production44_27 production = new Production44_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}