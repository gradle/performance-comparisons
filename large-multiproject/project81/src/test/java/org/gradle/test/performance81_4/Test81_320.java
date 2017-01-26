package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_320 {
    private final Production81_320 production = new Production81_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}