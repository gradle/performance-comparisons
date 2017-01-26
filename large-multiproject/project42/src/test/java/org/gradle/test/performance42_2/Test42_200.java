package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_200 {
    private final Production42_200 production = new Production42_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}