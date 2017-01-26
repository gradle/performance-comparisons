package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_167 {
    private final Production44_167 production = new Production44_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}