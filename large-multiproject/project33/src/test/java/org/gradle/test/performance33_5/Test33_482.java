package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_482 {
    private final Production33_482 production = new Production33_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}