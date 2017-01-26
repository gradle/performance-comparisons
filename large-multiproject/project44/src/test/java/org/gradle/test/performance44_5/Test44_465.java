package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_465 {
    private final Production44_465 production = new Production44_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}