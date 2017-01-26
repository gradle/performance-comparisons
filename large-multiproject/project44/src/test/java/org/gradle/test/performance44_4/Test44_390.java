package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_390 {
    private final Production44_390 production = new Production44_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}