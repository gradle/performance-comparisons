package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_93 {
    private final Production42_93 production = new Production42_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}