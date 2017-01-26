package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_84 {
    private final Production19_84 production = new Production19_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}