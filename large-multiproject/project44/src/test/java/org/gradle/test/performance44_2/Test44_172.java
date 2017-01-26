package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_172 {
    private final Production44_172 production = new Production44_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}