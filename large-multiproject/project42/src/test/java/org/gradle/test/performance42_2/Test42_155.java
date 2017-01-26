package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_155 {
    private final Production42_155 production = new Production42_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}