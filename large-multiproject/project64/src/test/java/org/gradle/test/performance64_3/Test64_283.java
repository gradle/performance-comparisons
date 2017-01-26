package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_283 {
    private final Production64_283 production = new Production64_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}