package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_89 {
    private final Production42_89 production = new Production42_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}