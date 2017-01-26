package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_390 {
    private final Production42_390 production = new Production42_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}