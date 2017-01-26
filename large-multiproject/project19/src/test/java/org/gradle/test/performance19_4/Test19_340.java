package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_340 {
    private final Production19_340 production = new Production19_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}