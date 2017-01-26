package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_330 {
    private final Production42_330 production = new Production42_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}