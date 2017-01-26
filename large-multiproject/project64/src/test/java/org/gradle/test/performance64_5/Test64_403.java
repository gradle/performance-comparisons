package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_403 {
    private final Production64_403 production = new Production64_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}