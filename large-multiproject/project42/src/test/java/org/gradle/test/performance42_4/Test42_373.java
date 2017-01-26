package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_373 {
    private final Production42_373 production = new Production42_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}