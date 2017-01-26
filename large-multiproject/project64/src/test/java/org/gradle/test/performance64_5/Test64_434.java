package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_434 {
    private final Production64_434 production = new Production64_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}