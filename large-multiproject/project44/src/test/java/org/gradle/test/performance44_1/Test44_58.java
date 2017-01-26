package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_58 {
    private final Production44_58 production = new Production44_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}