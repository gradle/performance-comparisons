package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_112 {
    private final Production42_112 production = new Production42_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}