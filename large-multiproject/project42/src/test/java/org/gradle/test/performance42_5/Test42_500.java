package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_500 {
    private final Production42_500 production = new Production42_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}