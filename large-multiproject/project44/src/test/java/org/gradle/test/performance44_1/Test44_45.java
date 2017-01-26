package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_45 {
    private final Production44_45 production = new Production44_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}