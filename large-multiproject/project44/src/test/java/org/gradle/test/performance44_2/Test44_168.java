package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_168 {
    private final Production44_168 production = new Production44_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}