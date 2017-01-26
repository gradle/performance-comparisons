package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_195 {
    private final Production42_195 production = new Production42_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}