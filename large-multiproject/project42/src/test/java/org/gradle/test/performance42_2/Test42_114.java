package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_114 {
    private final Production42_114 production = new Production42_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}