package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_434 {
    private final Production19_434 production = new Production19_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}