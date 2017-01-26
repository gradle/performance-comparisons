package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_434 {
    private final Production29_434 production = new Production29_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}