package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_126 {
    private final Production42_126 production = new Production42_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}