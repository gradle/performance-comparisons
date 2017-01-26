package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_107 {
    private final Production44_107 production = new Production44_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}