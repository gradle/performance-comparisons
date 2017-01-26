package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_89 {
    private final Production44_89 production = new Production44_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}