package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_305 {
    private final Production42_305 production = new Production42_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}