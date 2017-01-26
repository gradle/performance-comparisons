package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_362 {
    private final Production42_362 production = new Production42_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}