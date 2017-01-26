package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_434 {
    private final Production33_434 production = new Production33_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}