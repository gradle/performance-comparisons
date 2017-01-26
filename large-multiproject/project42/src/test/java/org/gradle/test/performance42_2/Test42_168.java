package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_168 {
    private final Production42_168 production = new Production42_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}