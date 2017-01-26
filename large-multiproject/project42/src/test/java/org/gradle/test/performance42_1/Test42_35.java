package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_35 {
    private final Production42_35 production = new Production42_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}