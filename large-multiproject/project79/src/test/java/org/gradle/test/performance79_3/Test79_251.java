package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_251 {
    private final Production79_251 production = new Production79_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}