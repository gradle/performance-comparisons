package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_500 {
    private final Production44_500 production = new Production44_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}