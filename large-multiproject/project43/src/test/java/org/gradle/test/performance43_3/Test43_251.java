package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_251 {
    private final Production43_251 production = new Production43_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}