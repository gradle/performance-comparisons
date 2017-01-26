package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_457 {
    private final Production44_457 production = new Production44_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}