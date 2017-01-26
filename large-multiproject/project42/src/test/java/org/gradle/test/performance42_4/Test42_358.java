package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_358 {
    private final Production42_358 production = new Production42_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}