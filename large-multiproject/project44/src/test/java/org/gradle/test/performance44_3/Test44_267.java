package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_267 {
    private final Production44_267 production = new Production44_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}