package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_469 {
    private final Production33_469 production = new Production33_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}