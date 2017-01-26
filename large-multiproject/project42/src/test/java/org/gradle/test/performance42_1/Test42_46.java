package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_46 {
    private final Production42_46 production = new Production42_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}