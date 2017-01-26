package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_434 {
    private final Production51_434 production = new Production51_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}