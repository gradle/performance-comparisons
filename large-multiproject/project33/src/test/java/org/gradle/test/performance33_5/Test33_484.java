package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_484 {
    private final Production33_484 production = new Production33_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}