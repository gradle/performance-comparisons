package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_434 {
    private final Production34_434 production = new Production34_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}