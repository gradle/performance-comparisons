package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_88 {
    private final Production44_88 production = new Production44_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}