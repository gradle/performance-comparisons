package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_288 {
    private final Production44_288 production = new Production44_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}