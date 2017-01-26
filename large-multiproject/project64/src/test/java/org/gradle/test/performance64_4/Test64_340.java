package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_340 {
    private final Production64_340 production = new Production64_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}