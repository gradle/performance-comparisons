package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_68 {
    private final Production42_68 production = new Production42_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}