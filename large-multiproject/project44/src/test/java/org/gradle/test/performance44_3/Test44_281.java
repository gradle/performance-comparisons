package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_281 {
    private final Production44_281 production = new Production44_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}