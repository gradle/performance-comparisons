package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_281 {
    private final Production42_281 production = new Production42_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}