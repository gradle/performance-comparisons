package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_225 {
    private final Production44_225 production = new Production44_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}