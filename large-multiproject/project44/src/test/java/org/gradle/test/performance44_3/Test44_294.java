package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_294 {
    private final Production44_294 production = new Production44_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}