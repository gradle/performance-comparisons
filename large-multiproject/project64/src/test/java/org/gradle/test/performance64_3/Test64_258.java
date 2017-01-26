package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_258 {
    private final Production64_258 production = new Production64_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}