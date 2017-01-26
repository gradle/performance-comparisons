package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_183 {
    private final Production44_183 production = new Production44_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}