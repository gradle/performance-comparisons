package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_356 {
    private final Production44_356 production = new Production44_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}