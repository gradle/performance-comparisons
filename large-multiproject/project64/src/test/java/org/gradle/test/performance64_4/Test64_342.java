package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_342 {
    private final Production64_342 production = new Production64_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}