package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_295 {
    private final Production64_295 production = new Production64_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}