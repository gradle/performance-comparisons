package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_55 {
    private final Production64_55 production = new Production64_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}