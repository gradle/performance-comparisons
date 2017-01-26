package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_313 {
    private final Production33_313 production = new Production33_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}