package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_41 {
    private final Production44_41 production = new Production44_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}