package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_147 {
    private final Production42_147 production = new Production42_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}