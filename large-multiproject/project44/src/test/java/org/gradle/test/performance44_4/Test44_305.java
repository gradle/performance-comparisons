package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_305 {
    private final Production44_305 production = new Production44_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}