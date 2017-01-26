package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_251 {
    private final Production33_251 production = new Production33_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}