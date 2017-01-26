package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_199 {
    private final Production42_199 production = new Production42_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}