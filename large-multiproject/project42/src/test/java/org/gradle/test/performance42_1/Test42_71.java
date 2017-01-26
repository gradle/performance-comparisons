package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_71 {
    private final Production42_71 production = new Production42_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}