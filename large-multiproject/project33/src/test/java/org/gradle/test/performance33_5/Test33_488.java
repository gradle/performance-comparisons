package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_488 {
    private final Production33_488 production = new Production33_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}