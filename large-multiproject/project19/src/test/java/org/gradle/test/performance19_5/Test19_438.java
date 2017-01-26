package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_438 {
    private final Production19_438 production = new Production19_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}