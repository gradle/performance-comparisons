package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_362 {
    private final Production81_362 production = new Production81_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}