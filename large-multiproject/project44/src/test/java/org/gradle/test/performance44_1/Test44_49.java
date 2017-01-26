package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_49 {
    private final Production44_49 production = new Production44_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}