package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_395 {
    private final Production33_395 production = new Production33_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}