package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_307 {
    private final Production64_307 production = new Production64_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}