package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_251 {
    private final Production73_251 production = new Production73_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}