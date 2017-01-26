package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_115 {
    private final Production19_115 production = new Production19_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}