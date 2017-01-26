package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_401 {
    private final Production64_401 production = new Production64_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}