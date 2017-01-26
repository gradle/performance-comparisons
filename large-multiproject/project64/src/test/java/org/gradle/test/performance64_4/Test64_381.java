package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_381 {
    private final Production64_381 production = new Production64_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}