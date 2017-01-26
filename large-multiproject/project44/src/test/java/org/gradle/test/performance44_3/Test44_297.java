package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_297 {
    private final Production44_297 production = new Production44_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}