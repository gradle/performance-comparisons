package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_77 {
    private final Production44_77 production = new Production44_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}