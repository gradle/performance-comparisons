package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_486 {
    private final Production19_486 production = new Production19_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}