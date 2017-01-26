package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_228 {
    private final Production42_228 production = new Production42_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}