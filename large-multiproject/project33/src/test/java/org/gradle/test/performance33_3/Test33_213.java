package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_213 {
    private final Production33_213 production = new Production33_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}