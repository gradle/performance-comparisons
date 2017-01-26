package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_398 {
    private final Production33_398 production = new Production33_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}