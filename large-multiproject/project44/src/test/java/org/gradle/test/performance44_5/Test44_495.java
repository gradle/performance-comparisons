package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_495 {
    private final Production44_495 production = new Production44_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}