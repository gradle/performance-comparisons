package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_49 {
    private final Production93_49 production = new Production93_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}