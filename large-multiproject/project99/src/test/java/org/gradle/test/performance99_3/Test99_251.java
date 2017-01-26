package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_251 {
    private final Production99_251 production = new Production99_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}