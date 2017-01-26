package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_45 {
    private final Production42_45 production = new Production42_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}