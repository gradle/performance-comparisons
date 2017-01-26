package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_238 {
    private final Production33_238 production = new Production33_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}