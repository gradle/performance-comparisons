package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_220 {
    private final Production42_220 production = new Production42_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}