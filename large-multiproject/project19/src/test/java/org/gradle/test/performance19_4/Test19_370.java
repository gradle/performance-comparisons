package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_370 {
    private final Production19_370 production = new Production19_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}