package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_188 {
    private final Production44_188 production = new Production44_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}