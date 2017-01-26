package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_458 {
    private final Production42_458 production = new Production42_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}