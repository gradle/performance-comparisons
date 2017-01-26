package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_392 {
    private final Production97_392 production = new Production97_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}