package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_209 {
    private final Production42_209 production = new Production42_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}