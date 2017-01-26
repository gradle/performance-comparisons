package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_363 {
    private final Production64_363 production = new Production64_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}