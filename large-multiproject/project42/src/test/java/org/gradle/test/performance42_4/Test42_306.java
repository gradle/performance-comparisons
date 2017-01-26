package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_306 {
    private final Production42_306 production = new Production42_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}