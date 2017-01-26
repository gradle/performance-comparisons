package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_413 {
    private final Production19_413 production = new Production19_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}