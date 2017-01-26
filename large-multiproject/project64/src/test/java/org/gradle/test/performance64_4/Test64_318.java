package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_318 {
    private final Production64_318 production = new Production64_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}