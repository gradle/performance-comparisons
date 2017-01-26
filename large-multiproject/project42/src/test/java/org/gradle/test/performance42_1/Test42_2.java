package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_2 {
    private final Production42_2 production = new Production42_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}