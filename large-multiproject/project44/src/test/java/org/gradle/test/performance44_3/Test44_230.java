package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_230 {
    private final Production44_230 production = new Production44_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}