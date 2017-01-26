package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_370 {
    private final Production64_370 production = new Production64_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}