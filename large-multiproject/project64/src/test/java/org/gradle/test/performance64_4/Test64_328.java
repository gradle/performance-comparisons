package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_328 {
    private final Production64_328 production = new Production64_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}